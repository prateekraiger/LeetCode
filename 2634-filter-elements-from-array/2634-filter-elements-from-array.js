/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var filarr=[];

    for(var i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            filarr.push(arr[i]);
        }
    }
    return filarr;
};