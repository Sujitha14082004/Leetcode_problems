/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let first=0;
    let second=1;
    while(true){
        yield first;
        let temp=first+second;
        first=second;
        second=temp;
        }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */