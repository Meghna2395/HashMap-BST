package com.bridzelabz.bst;

public class BSTImplementation {

	public static void main(String[] args) {
		int[] keys = { 56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67 };
		Node root = null;
		for (int key : keys) {
			System.out.println(key);
			root = insertNode(root, key);
		}
		searchElement(root, 63);
	}

	public static Node insertNode(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}
		if (key < root.data) {
			root.left = insertNode(root.left, key);
		} else {
			root.right = insertNode(root.right, key);
		}
		return root;
	}

	public static void searchElement(Node root, int key) {
		Node curr = root;
		Node parent = null;

		while (curr != null && curr.data != key) {
			parent = curr;

			if (key < curr.data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}

		if (curr == null) {
			System.out.println("Key not found");
			return;
		} else if (key < parent.data) {
			System.out.println("The given key is the left node of the node with key" + parent.data);
		} else {
			System.out.println("The given key is the right node of the node with key" + parent.data);
		}

	}
}
