/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
   let presentcount=init;
   function increment(){
    presentcount++;
    return presentcount
   } 
   function reset(){
    presentcount=init;
    return presentcount
   }
   function decrement(){
    presentcount--;
    return presentcount
   }
   return{increment,reset,decrement};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */