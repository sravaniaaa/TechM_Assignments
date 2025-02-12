function triangleArea(a, b, c) {
    let s = (a + b + c) / 2; 
    let area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    return area.toFixed(2);
}

let area = triangleArea(5, 6, 7);
console.log(`The area of the triangle is: ${area}`);
