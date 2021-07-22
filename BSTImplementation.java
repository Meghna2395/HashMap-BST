package com.bridzelabz.bst;

public class BSTImplementation {

	public static void main(String[] args) {
		int[] numberArray = { 56, 30, 70 };
		Node root = null;
		for (int number : numberArray) {
			System.out.println(number);
			root = insertNode(root, number);
		}
	}

	public static Node insertNode(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insertNode(root.right, data);
		} else {
			root.right = insertNode(root.right, data);
		}
		return root;
	}

}
