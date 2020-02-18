var mergeSort = function(array, p, q, r) {
    var lowHalf = [];
    var highHalf = [];

    var k = p;
    var i;
    var j;
    for (i = 0; k <= q; i++, k++) {
        lowHalf[i] = array[k];
    }
    for (j = 0; k <= r; j++, k++) {
        highHalf[j] = array[k];
    }

    k = p;
    i = 0;
    j = 0;
    
    while (i < lowHalf.length && j < highHalf.length) {
        if (lowHalf[i] <= highHalf[j]) {
            array[k] = lowHalf[i];
            i++;
            k++;
        } else {
            array[k] = highHalf[j];
            j++;
            k++;
            }
    }
    
    while (i < lowHalf.length) {
        array[k] = lowHalf[i];
        k++;
        i++;
    }
    while (j < highHalf.length) {
        array[k] = highHalf[j];
        k++;
        j++;
    }
};


var array = [3, 7, 12, 14, 2, 6, 9, 11];
mergeSort(array, 0,
    Math.floor((0 + array.length-1) / 2),
    array.length-1);
println("Array after merging: " + array);