/*public class equals {
    int petalCount = 0;
    String s = new String("null");

    // Constructor 1: nhận số cánh
    equals(int petals) { 
        petalCount = petals; 
    }

    // Constructor 2: nhận chuỗi
    equals(String ss) { 
        s = ss; 
    }

    // Constructor 3: nhận cả chuỗi và số
    equals(String s, int petals) {
        this(petals);   // gọi constructor Flower(int petals)
        //! this(s);    // ❌ không được gọi 2 lần this() trong cùng constructor
        this.s = s;     // gán chuỗi cho biến thành viên
    }

    // Constructor 4: mặc định (không tham số)
    equals() { 
        this("hi", 47); // gọi constructor 3
    }
}
*/