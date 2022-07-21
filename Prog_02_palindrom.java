public class Prog_02_palindrom {
   /**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    
const reverse = x.toString().split("").reverse().join("");
const StringX = x.toString();
if (StringX === reverse) {
return true;
}
return false;
};

console.log(isPalindrome); 
}
