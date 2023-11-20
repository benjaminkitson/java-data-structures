package binarysearchtree;

public class BinarySearchTree {
    private Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    // public boolean contains(int value) {
    // if (root == null) {
    // return false;
    // }
    // Node temp = root;
    // while (true) {
    // if (temp.value == value) {
    // return true;
    // }
    // if (temp == null) {
    // return false;
    // }
    // if (value < temp.value) {
    // temp = temp.left;
    // } else {
    // temp = temp.right;
    // }
    // }
    // }

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode.value == value)
            return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        }
        if (value > currentNode.value) {
            return rContains(currentNode.right, value);
        }
        return false;
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null)
            return new Node(value);
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        }
        if (value > currentNode.value) {
            currentNode.left = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null)
            root = new Node(value);
        rInsert(root, value);
    }

    private Node rDeleteNode(Node currentNode, int value) {
        if (currentNode == null)
            return null;
        if (value < currentNode.value) {
            currentNode.left = rDeleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rDeleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }
            if (currentNode.left == null) {
                currentNode = currentNode.right;
            }
            if (currentNode.right == null) {
                currentNode = currentNode.left;
            }
            int subTreeMin = minValue(currentNode.right);
            currentNode.value = subTreeMin;
            currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
        }
        return currentNode;
    }

    private int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

}
