// Java Script Practice
console.log("Hello World");
const link = document.getElementById('quote');
const h1 = document.getElementById('quoteDisplay');
function addQuote() {
    h1.innerHTML = '"' + link.value + '"';
    h1.style.fontFamily = document.getElementById('fonts');

}
