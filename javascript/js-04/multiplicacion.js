
let arr = [ //matriz A
    [2, 5, 6], 
    [5, 9, 7],
    [6, 4, 3]
];
let arr2 = [ //matriz B
    [5, 3, 2], 
    [8, 5, 4],
    [1, 4, 9]
];
/*let matrizR=[
    [],[],[],
] */
for(let i=0; i <= 2; i++){
    for(let j=0; j <= 2; j++){
        console.log(arr[i][j]*arr2[j][i]);
//matrizR[i][j] = arr[i][j]* arr2[j][i];
    }
}
//console.log(matrizR);