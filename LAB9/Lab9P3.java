import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

class Lab9p3 extends JFrame {

    Lab9p3() {
        super("Tree Demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Fruits");
        root.add(new DefaultMutableTreeNode("Apple"));
        root.add(new DefaultMutableTreeNode("Kiwi"));
        root.add(new DefaultMutableTreeNode("Watermelon"));
        root.add(new DefaultMutableTreeNode("Orange"));

        JTree jtr = new JTree(root);
        add(new JScrollPane(jtr));

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String... args) {
        new Lab9p3();
    }
}
