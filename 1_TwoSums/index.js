// cho 1 mảng số nguyên và 1 biến nguyền target , hãy trả lại index của 2 số cộng lại bằng target

var twosum = function(nums,target){
    for(let i =0 ; i<nums.length; i++){
        for(let j= i+1; j <nums.length; j++)
            if( (nums[i] + nums[j] === target)){
                return [i,j]
            }
        }
    };