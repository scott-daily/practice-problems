var binarySearch = function(array, n) {
    var min = 0;
    var max = array.length-1;
    var guess;

    while (max >= min) {
        guess = (min + max) / 2;
        
        if (array[guess] == n) {
            return n;
        }
        else if (array[guess] < n) {
            min = guess + 1;
        }
        else {
            max = guess - 1;
        }
        return -1;
    }
};
