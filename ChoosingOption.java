import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // --- PHẦN CODE CHÍNH ---
        int option = JOptionPane.showConfirmDialog(null, 
                "Do you want to change to the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You've chosen: " 
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        
        System.exit(0);

        /* * --- PHẦN TRẢ LỜI CÂU HỎI (QUESTIONS) ---
         * * Question 1: What happens if users choose "Cancel"?
         * Answer: Nếu người dùng chọn "Cancel", biến option sẽ nhận giá trị khác với JOptionPane.YES_OPTION. 
         * Do đó, toán tử ba ngôi sẽ trả về "No", và màn hình sẽ in ra thông báo "You've chosen: No".
         * * Question 2: How to customize the options to users (e.g., "I do" and "I don't")?
         * Answer: Để tùy chỉnh text của các nút, ta không dùng showConfirmDialog nữa mà chuyển sang dùng 
         * hàm showOptionDialog và truyền vào một mảng Object chứa các lựa chọn.
         * Ví dụ:
         * Object[] options = {"I do", "I don't"};
         * int choice = JOptionPane.showOptionDialog(null, "Message", "Title",
         * JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
         */
    }
}