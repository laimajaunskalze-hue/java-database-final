const apiURL = 'https://laimajaunska-8080.theiadockernext-0-labs-prod-theiak8s-4-tor01.proxy.cognitiveclass.ai'; 
async function getProducts() {
    try {
        const r = await fetch(`${apiURL}/products`);
        const d = await r.json();
        const l = document.getElementById('product-list');
        l.innerHTML = '';
        d.forEach(p => {
            const i = document.createElement('li');
            i.innerHTML = `<strong>${p.title}</strong> - ${p.price} EUR`;
            l.appendChild(i);
        });
    } catch (e) {
        document.getElementById('product-list').innerHTML = 'Saziņas kļūda. Pārbaudi vai 8080 ports ir atvērts.';
    }
}
window.onload = getProducts;
