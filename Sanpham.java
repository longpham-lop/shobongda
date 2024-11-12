package connecttosql;

import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sanpham extends javax.swing.JFrame {
    private ArrayList<Product> list;
    private Cart cart = new Cart();
    DefaultTableModel model;
    private Bill billWindow; 
    
    public Sanpham() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = new DAO().getListProduct();
        model = (DefaultTableModel) tblProducts.getModel();
        
        model.setColumnIdentifiers(new Object[]{
            "STT", "ID", "Name", "Price", "Number", "Describe"
        });
        showTable();
        
        billWindow = new Bill();
        
    }
    public void showTable(){
        int i =1;
        model.setRowCount(0);
        for(Product p : list){
            model.addRow(new Object[]{
                i++, p.getID(), p.getName(), p.getPrice(), p.getNumber(), p.getDescribe()
            });
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtDescribe = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnMove = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("QUẢN LÝ SẢN PHẨM");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá", "Số lượng", "Mô tả"
            }
        ));
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã sản phẩm");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên sản phẩm");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giá");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số lượng");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mô tả");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnMove.setText("Hủy");
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });

        btnAddToCart.setText("Thêm vào giỏ hàng");
        btnAddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToCartMouseClicked(evt);
            }
        });
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addComponent(txtPrice)
                            .addComponent(txtNumber)
                            .addComponent(txtDescribe)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMove, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnAddToCart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnMove))
                .addGap(18, 18, 18)
                .addComponent(btnAddToCart)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String id = txtID.getText();
        boolean isDuplicate = false;

        // Kiểm tra sản phẩm trùng lặp
        for (Product product : list) {
            if (product.getID().equals(id)) {
                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate) {
            JOptionPane.showMessageDialog(rootPane, "Product ID already exists!");
            return; // Kết thúc nếu ID đã tồn tại
        }
        Product p = new Product();
        p.setID(txtID.getText());
        p.setName(txtName.getText());
        p.setPrice(txtPrice.getText());
        p.setNumber(txtNumber.getText());
        p.setDescribe(txtDescribe.getText());
        
       
        if(new DAO().addProduct(p)){
            JOptionPane.showMessageDialog(rootPane, "Thêm sản phẩm thành công");
            list.add(p);
            showTable();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Thêm sản phẩm thất bại");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    int selectedRow = tblProducts.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sản phẩm cần xóa.");
        return;
    }

    // Xác nhận xóa
    int confirmation = JOptionPane.showConfirmDialog(rootPane, 
        "Bạn có chắc chắn muốn xóa sản phẩm này?", 
        "Xác nhận xóa", 
        JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
        String idToDelete = (String) model.getValueAt(selectedRow, 1); // Lấy ID sản phẩm từ cột thứ 1

        // Gọi phương thức xóa trong DAO
        if (new DAO().deleteProduct(idToDelete)) { // Giả định bạn có phương thức deleteProduct trong DAO
            JOptionPane.showMessageDialog(rootPane, "Xóa sản phẩm thành công.");
            list.remove(selectedRow); // Xóa sản phẩm khỏi danh sách
            showTable(); // Cập nhật bảng
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa sản phẩm thất bại.");
        }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed
 
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int selectedRow = tblProducts.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sản phẩm cần sửa.");
        return;
    }

    // Lấy ID sản phẩm để tìm và sửa trong danh sách
    String idToEdit = (String) model.getValueAt(selectedRow, 1);
    Product p = new Product();
    p.setID(txtID.getText());
    p.setName(txtName.getText());
    p.setPrice(txtPrice.getText());
    p.setNumber(txtNumber.getText());
    p.setDescribe(txtDescribe.getText());

    // Cập nhật sản phẩm trong cơ sở dữ liệu
    if (new DAO().updateProduct(p)) { // Giả định bạn có phương thức updateProduct trong DAO
        JOptionPane.showMessageDialog(rootPane, "Sửa sản phẩm thành công.");
        list.set(selectedRow, p); // Cập nhật sản phẩm trong danh sách
        showTable(); // Cập nhật bảng
    } else {
        JOptionPane.showMessageDialog(rootPane, "Sửa sản phẩm thất bại.");
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoveActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int selectedRow = tblProducts.getSelectedRow();
        if (selectedRow != -1) {
            txtID.setText(model.getValueAt(selectedRow, 1).toString());
            txtName.setText(model.getValueAt(selectedRow, 2).toString());
            txtPrice.setText(model.getValueAt(selectedRow, 3).toString());
            txtNumber.setText(model.getValueAt(selectedRow, 4).toString());
            txtDescribe.setText(model.getValueAt(selectedRow, 5).toString());
        }
        
         
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         String keyword = jTextField1.getText().trim(); // Lấy từ khóa tìm kiếm từ ô nhập

        if (keyword.isEmpty()) {
            showTable(); // Nếu từ khóa rỗng, hiển thị lại tất cả sản phẩm
            return;
        }

        List<Product> filteredList = new ArrayList<>(); // Danh sách để chứa kết quả tìm kiếm

        // Tìm kiếm trong danh sách
        for (Product product : list) {
            // Kiểm tra xem tên sản phẩm có chứa từ khóa không (không phân biệt chữ hoa chữ thường)
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                filteredList.add(product); // Thêm vào danh sách kết quả nếu tìm thấy
            }
        }

        // Cập nhật bảng với danh sách đã lọc
        updateTable(filteredList);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
           int selectedRow = tblProducts.getSelectedRow();

        // Kiểm tra xem người dùng có chọn dòng nào không
        if (selectedRow != -1) {
            // Lấy thông tin sản phẩm từ dòng đã chọn
            String id = (String) tblProducts.getValueAt(selectedRow, 1);  // ID sản phẩm
            String name = (String) tblProducts.getValueAt(selectedRow, 2);  // Tên sản phẩm
            String price = (String) tblProducts.getValueAt(selectedRow, 3);  // Giá sản phẩm
            String number = (String) tblProducts.getValueAt(selectedRow, 4);  // Số lượng sản phẩm
            String describe = (String) tblProducts.getValueAt(selectedRow, 5);  // Mô tả sản phẩm

            // Lấy số lượng cần thêm từ JTextField (txtQuantity)
            String quantityText = JOptionPane.showInputDialog(this, "Nhập số lượng sản phẩm cần mua:", "Số lượng", JOptionPane.QUESTION_MESSAGE);

            // Kiểm tra nếu người dùng không nhập gì và nhấn Cancel hoặc đóng hộp thoại
            if (quantityText == null || quantityText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng sản phẩm!");
                return;
            }

            // Kiểm tra xem số lượng có phải là một số nguyên không
            int quantity;
            try {
                quantity = Integer.parseInt(quantityText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Số lượng phải là một số nguyên hợp lệ!");
                return;
            }

            // Tạo một đối tượng Product từ thông tin lấy được
            Product product = new Product(id, name, price, String.valueOf(quantity), describe);
             cart.addProduct(product);
            // Thêm sản phẩm vào giỏ hàng
           
            billWindow.addProductToBill(product);
            
       
            if(!billWindow.isVisible()){
                billWindow.setVisible(true);
            }
            
            // Thông báo cho người dùng
            JOptionPane.showMessageDialog(this, "Sản phẩm đã được thêm vào giỏ hàng!");
        } else {
            // Nếu không chọn sản phẩm nào, thông báo cho người dùng
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để thêm vào giỏ hàng!");
        }
        
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnAddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToCartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToCartMouseClicked
    private void updateTable(List<Product> filteredList) {
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel(); // Lấy mô hình bảng
        model.setRowCount(0); // Xóa tất cả hàng hiện có trong bảng

        int i = 1; // Đếm số thứ tự
        // Thêm lại dữ liệu từ danh sách đã lọc vào mô hình bảng
        for (Product product : filteredList) {
            model.addRow(new Object[]{
                i++, product.getID(),
                product.getName(),
                product.getPrice(),
                product.getNumber(),
                product.getDescribe()
            });
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sanpham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtDescribe;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
