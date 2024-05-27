document.addEventListener('DOMContentLoaded', function() {
    const profileContainer = document.getElementById('profile-container');

    const imageRow = document.createElement('div');
    imageRow.className = 'row image';

    const img = document.createElement('img');
    img.src = './rohit.jpeg';
    img.alt = 'Profile Picture';
    img.className = 'img-fluid rounded-circle';

    const penIcon = document.createElement('i');
    penIcon.className = 'fas fa-pen';

    imageRow.appendChild(img);
    // imageRow.appendChild(penIcon);
    profileContainer.appendChild(imageRow);

    const fields = [
        { label: 'Name', type: 'text', id: 'name', name: 'name' },
        { label: 'Email', type: 'email', id: 'email', name: 'email' },
        { label: 'Mobile', type: 'tel', id: 'mobileNo', name: 'mobileNo' },
        { label: 'DOB', type: 'date', id: 'dob', name: 'dob' }
    ];

    const txtFieldsDiv = document.createElement('div');
    txtFieldsDiv.className = 'flex-column w-100';

    fields.forEach(field => {
        const formGroup = document.createElement('div');
        formGroup.className = 'form-group d-flex justify-content-between';

        const label = document.createElement('label');
        label.setAttribute('for', field.id);
        label.textContent = field.label;

        const input = document.createElement('input');
        input.type = field.type;
        input.id = field.id;
        input.name = field.name;
        input.className = 'form-control';
        
        formGroup.appendChild(label);
        formGroup.appendChild(input);
        txtFieldsDiv.appendChild(formGroup);
    });

    profileContainer.appendChild(txtFieldsDiv);

    const buttonDiv = document.createElement('div');
    buttonDiv.className = 'button w-100';

    const button = document.createElement('button');
    button.className = 'btn btn-primary btnSubmit w-100';
    button.textContent = 'Submit';

    buttonDiv.appendChild(button);
    profileContainer.appendChild(buttonDiv);
});