// cho 1 mảng số nguyên và 1 biến nguyền target , hãy trả lại index của 2 số cộng lại bằng target

//do phuc tap O(n^2)
var twosum = function(nums,target){
    for(let i =0 ; i<nums.length; i++){
        for(let j= i+1; j <nums.length; j++)
            if( (nums[i] + nums[j] === target)){
                return [i,j]
            }
        }
    };

// cách 2: dùng hash table
var twosum = function( nums, target){
    const visittedNums = new Map();
    for (let i = 0; i < nums.length; i++){
        const neededNums = target - nums[i];
        const indexOfNeededNums = visittedNums.get(neededNums);
        if (indexOfNeededNums >= 0){
            return [i,indexOfNeededNums];
        }
        visittedNums.set(nums[i],i)
    }

}