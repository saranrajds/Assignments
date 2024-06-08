// script.js

document.addEventListener('DOMContentLoaded', () => {
    const fileInput = document.getElementById('fileInput');
    const songsContainer = document.getElementById('songs');
    const favoriteSongsContainer = document.getElementById('favoriteSongs');
    const audioPlayer = document.getElementById('audioPlayer');
    const playlistContainer = document.getElementById('playlistContainer');
    const addPlaylistButton = document.getElementById('addPlaylist');
    const _PlaylistSong = document.getElementById('playlists');

    let songs = [];
    let favorites = [];
    let playlists = {};

    fileInput.addEventListener('change', handleFiles);

    function handleFiles(event) {
        const files = event.target.files;
        for (const file of files) {
            if (file.type.startsWith('audio/')) {
                const song = {
                    id: Date.now() + Math.random(),
                    name: file.name,
                    file: URL.createObjectURL(file),
                    favorite: false
                };
                songs.push(song);
                renderSong(song, songsContainer);
            }
        }
    }

    function renderSong(song, container, isFromPlayList = false) {
        const songCard = document.createElement('div');
        songCard.classList.add('song-card');
        songCard.innerHTML = `
            <div class="song-info">
                <p class="song-title">${song.name}</p>
            </div>`;

        if (isFromPlayList) {
            songCard.innerHTML += `<div class="song-controls">
            <button class="play-btn" onclick="playSong('${song.file}')">▶️</button>
            </div>`;
        } else {
            songCard.innerHTML += `<div class="song-controls">
                <button class="favorite-btn" onclick="toggleFavorite(${song.id})">☆</button>
                <button class="playlist-btn" onclick="addToPlaylist(${song.id})">➕</button>
                <button class="play-btn" onclick="playSong('${song.file}')">▶️</button>
            </div>`;
        }
        
        container.appendChild(songCard);
    }

    window.toggleFavorite = function(id) {
        const song = songs.find(s => s.id === id);
        if (song) {
            song.favorite = !song.favorite;
            renderFavorites();
        }
    }

    function renderFavorites() {
        favoriteSongsContainer.innerHTML = '';
        const favoriteSongs = songs.filter(s => s.favorite);
        for (const song of favoriteSongs) {
            renderSong(song, favoriteSongsContainer);
        }
    }

    window.playSong = function(file) {
        audioPlayer.src = file;
        audioPlayer.play();
    }

    addPlaylistButton.addEventListener('click', () => {
        const playlistName = prompt('Enter playlist name:');
        if (playlistName && !playlists[playlistName]) {
            playlists[playlistName] = [];
            renderPlaylists();
        } else {
            alert('Playlist already exists or invalid name.');
        }
    });

    function renderPlaylists() {
        playlistContainer.innerHTML = '';
        for (const [name, playlistSongs] of Object.entries(playlists)) {
            const playlistDiv = document.createElement('div');
            playlistDiv.classList.add('playlist');
            playlistDiv.innerHTML = `
                <div class="playlist-info">
                    <p class="playlist-name">${name} (${playlistSongs.length} songs)</p>
                </div>
                <div class="playlist-controls">
                    <button class="remove-btn" onclick="removePlaylist('${name}')">❌</button>
                    <button class="view-btn" onclick="viewPlaylist('${name}')">👁️</button>
                </div>
            `;
            playlistContainer.appendChild(playlistDiv);
        }
    }

    window.removePlaylist = function(name) {
        delete playlists[name];
        const playlistDiv = document.createElement('div');
        _PlaylistSong.innerHTML = "";
        renderPlaylists();
    }

    window.viewPlaylist = function(name) {
        const playlistSongs = playlists[name];
        const playlistSongsContainer = document.createElement('div');
        playlistSongsContainer.classList.add('section');
        playlistSongsContainer.innerHTML = `<h2>${name}</h2>`;
        playlistSongs.forEach(song => {
            renderSong(song, playlistSongsContainer, true);
        });

        const existingContainer = document.getElementById('playlistSongs');
        if (existingContainer) {
            existingContainer.remove();
        }
        playlistSongsContainer.id = 'playlistSongs';
        _PlaylistSong.appendChild(playlistSongsContainer);
        // document.body.appendChild(playlistSongsContainer);
    }

    window.addToPlaylist = function(id) {
        const playlistName = prompt('Enter playlist name to add to:');
        if (playlistName && playlists[playlistName]) {
            const song = songs.find(s => s.id === id);
            if (song && !playlists[playlistName].some(s => s.id === id)) {
                playlists[playlistName].push(song);
                renderPlaylists();
            } else {
                alert('Song already in playlist or playlist does not exist.');
            }
        } else {
            alert('Playlist does not exist.');
        }
    }
});
