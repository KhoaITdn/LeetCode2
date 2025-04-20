function formSmallestNum(num) {
    // Chuyển chuỗi thành mảng các ký tự
    let digits = num.split('');
    digits.sort();

    // Tìm chữ số khác 0 đầu tiên
    let firstNonZeroIndex = -1;
    for (let i = 0; i < digits.length; i++) {
        if (digits[i] !== '0') {
            firstNonZeroIndex = i;
            break;
        }
    }

    // Nếu không có số khác 0 -> tất cả là 0
    if (firstNonZeroIndex === -1) {
        return "0";
    }

    // Đưa số khác 0 đầu tiên lên đầu mảng
    [digits[0], digits[firstNonZeroIndex]] = [digits[firstNonZeroIndex], digits[0]];

    // Nối mảng thành chuỗi kết quả
    return digits.join('');
}

// Test thử
console.log(formSmallestNum("4321"));    // Output: 1234
console.log(formSmallestNum("0000"));    // Output: 0
console.log(formSmallestNum("50120"));   // Output: 10025
