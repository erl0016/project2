import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public JFrame view;

    public JButton btnAddCustomer = new JButton("Manage Customers");
    public JButton btnAddPurchase = new JButton("Manage Purchases");
    public JButton btnManageProduct = new JButton("Manage Products");

    public MainUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnManageProduct);
        panelButtons.add(btnAddCustomer);
        panelButtons.add(btnAddPurchase);

        view.getContentPane().add(panelButtons);

        btnAddPurchase.addActionListener(actionEvent -> {
            //AddPurchaseUI ap = new AddPurchaseUI();
            //ap.run();
            ManagePurchaseUI mp = new ManagePurchaseUI();
            mp.run();
        });

        btnManageProduct.addActionListener(actionEvent -> {
            ManageProductUI ui = new ManageProductUI();
            ui.run();
        });

        btnAddCustomer.addActionListener(actionEvent -> {
            ManageCustomerUI ui = new ManageCustomerUI();
            ui.run();
        });
    }
}
