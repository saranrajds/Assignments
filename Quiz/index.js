
getQueryParams();

function getQueryParams() {
    const params = new URLSearchParams(window.location.search);
    const qustion = params.get('q');
    console.log(qustion);
    if (qustion == null) {
        
    } else {
        
    }
}