const displayedImg = document.querySelector('.displayed-img');
const thumbBar = document.querySelector('.thumb-bar');
const btn = document.querySelector('button');
const overlay = document.querySelector('.overlay');

/* Array das imagens */
const images = ['pic1.jpg', 'pic2.jpg', 'pic3.jpg', 'pic4.jpg', 'pic5.jpg'];
const alts = [
  'Close de um olho humano',
  'Formação rochosa',
  'Flores roxas',
  'Pintura egípcia',
  'Borboleta'
];

/* Loop das miniaturas */
for (let i = 0; i < images.length; i++) {
  const newImage = document.createElement('img');
  newImage.setAttribute('src', 'images/' + images[i]);
  newImage.setAttribute('alt', alts[i]);
  thumbBar.appendChild(newImage);

  newImage.onclick = function () {
    displayedImg.src = this.src;
    displayedImg.alt = this.alt;
  };
}

/* Botão escurecer / clarear */
btn.onclick = function () {
  if (btn.className === 'dark') {
    btn.className = 'light';
    btn.textContent = 'Clarear';
    overlay.style.backgroundColor = 'rgba(0,0,0,0.5)';
  } else {
    btn.className = 'dark';
    btn.textContent = 'Escurecer';
    overlay.style.backgroundColor = 'rgba(0,0,0,0)';
  }
};
