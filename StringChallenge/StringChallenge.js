function StringChallenge(Str) {
    let result = Str[0];  // Khởi tạo kết quả với ký tự đầu tiên

    for (let i = 1; i < Str.length; i++) {
        let prev = parseInt(Str[i - 1]);
        let current = parseInt(Str[i]);

        // Kiểm tra nếu cả 2 đều lẻ (và khác 0)
        if (prev % 2 === 1 && current % 2 === 1) {
            result += '-' + current;
        }
        // Kiểm tra nếu cả 2 đều chẵn (và khác 0)
        else if (prev !== 0 && current !== 0 && prev % 2 === 0 && current % 2 === 0) {
            result += '*' + current;
        }
        // Nếu không thì nối thẳng
        else {
            result += current;
        }
    }

    return result;
}

// Ví dụ:
console.log(StringChallenge("29292")); // Output: 2*9-2*9-2
console.log(StringChallenge("123456789")); // Output: 1*2*3*4*5*6*7*8*9