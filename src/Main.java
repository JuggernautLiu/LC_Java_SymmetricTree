public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] samples = {1,2,2,3,4,4,3};
		TreeNode root = creatSymTreeNode1();
		boolean bSymm = isSymmetric(root);
		System.out.println(bSymm);
		
		TreeNode root2 = creatNotSymTreeNode1();
		boolean bSymm2 = isSymmetric(root2);
		System.out.println(bSymm2);

	}
	
public static TreeNode creatNotSymTreeNode1() {
    	
    	TreeNode root = new TreeNode(1);
    	TreeNode n2 = new TreeNode(2);
    	TreeNode n3 = new TreeNode(2);
    	TreeNode n4 = new TreeNode(3);
    	TreeNode n5 = new TreeNode(4);
    	TreeNode n6 = new TreeNode(4);
    	
    	
    	root.left = n2;
    	root.right = n3;
    	n2.left = n4;
    	n2.right = n5;
    	n3.left = n6;
    	
        return root;
    }
	
    public static TreeNode creatSymTreeNode1() {
    	
    	TreeNode root = new TreeNode(1);
    	TreeNode n2 = new TreeNode(2);
    	TreeNode n3 = new TreeNode(2);
    	TreeNode n4 = new TreeNode(3);
    	TreeNode n5 = new TreeNode(4);
    	TreeNode n6 = new TreeNode(4);
    	TreeNode n7 = new TreeNode(3);
    	
    	root.left = n2;
    	root.right = n3;
    	n2.left = n4;
    	n2.right = n5;
    	n3.left = n6;
    	n3.right = n7;
        return root;
    }
	
    public static boolean is2NodesSymmetric(TreeNode left, TreeNode right)
    {
    	if(left == null && right ==null)
    	{
    		return true;    		
    	}
    	if(left == null || right ==null)
    	{
    		return false;    		
    	}
    	
    	boolean bSameVal = (left.val == right.val);
    	boolean bsubtree1 = is2NodesSymmetric(left.left, right.right);
    	boolean bsubtree2 = is2NodesSymmetric(left.right, right.left);
    	
    	return bSameVal && bsubtree1 && bsubtree2;
    	
    	
    }
    
    public static boolean isSymmetric(TreeNode root) {
    	
    	if(root == null)
    	{
    		return true;
    	}
    	
    	boolean bSymmetric = is2NodesSymmetric(root.left, root.right);
    	return bSymmetric;	
    }

}
