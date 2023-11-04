package DSA.Milestone5.BST1;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        root.left = rootLeft;
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
        root.right = rootRight;
        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
        rootLeft.right = twoRight;
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
        rootRight.left = threeLeft;

    }
}
