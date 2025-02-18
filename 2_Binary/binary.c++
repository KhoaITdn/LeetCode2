#include <iostream>

using namespace std;

bool binary_search(int a[], int n, int x){
    //Khởi tạo left, right
    int l = 0, r = n - 1;
    while(l <= r){
        //Tính chỉ số của phần tử ở giữa
        int m = (l + r) / 2;
        if(a[m] == x){
            return true; // tìm thấy
        }
        else if(a[m] < x){
            //tìm kiếm ở bên phải
            l = m + 1;
        }
        else{
            //tìm kiếm ở bên trái
            r = m - 1;
        }
    }
    return false; // l > r
}

int main(){
    int n = 12, x = 24, y = 6;
    int a[12] = {1, 2, 3, 4, 5, 5, 7, 9, 13, 24, 27, 28};
    if(binary_search(a, n, x)){
        cout << "FOUND\n";
    }
    else cout << "NOT FOUND\n";
    if(binary_search(a, n, y)){
        cout << "FOUND\n";
    }
    else cout << "NOT FOUND\n";
    return 0;
}