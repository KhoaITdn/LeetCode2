#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int findMaxConsecutiveOnes(vector<int> nums)
{
    int max= 0;
    int count = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (nums[i] == 1)
        {
            count = 0;
        }
        else
        {
            count++;
            max = (count > max) ? count : max;
            
        }
    }
    return max;
}



// bubble sort


