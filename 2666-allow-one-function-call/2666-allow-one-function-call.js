/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let called = true;
    return function(...args){
        //for( let i = 0 ; i < calls.length ; i++)
        // return fn(calls[i][0],calls[i][1],calls[i][2])
        
        if(called){
            called = !called;
            return fn(...args);
            
        }else{
            return undefined;
        }
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
