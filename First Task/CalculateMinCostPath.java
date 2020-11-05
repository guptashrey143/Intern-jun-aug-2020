package FirstTask;

public class CalculateMinCostPath {
    TraverseList traversed = new TraverseList();

    public int minCost(int costArray[][], int m, int n) {

        int pathCost = costArray[0][0];
        if (m == 0 && n == 0) {
            return pathCost;
        }
        traversed.add(0, 0);
        return pathCost + Math.min(down(costArray, m, n, 1, 0), right(costArray, m, n, 0, 1));
    }

    public int up(int costArray[][], int m, int n, int i, int j) {
        if (traversed.listSearch(i, j)) {
            return -1;
        }
        if (i == m && j == n) {
            return costArray[i][j];
        }
        int pathCost;

        int currentCost = costArray[i][j];

        traversed.add(i, j);

        int up;
        int left;
        int right;

        if (i == 0) {
            up = -1;
        } else {
            up = up(costArray, m, n, i - 1, j);
        }

        if (j == 0) {
            left = -1;
        } else {
            left = left(costArray, m, n, i, j - 1);
        }

        if (j == costArray[0].length - 1) {
            right = -1;
        } else {
            right = right(costArray, m, n, i, j + 1);
        }

        if (up == -1) {
            if (left == -1) {
                if (right == -1) {
                    pathCost = -1;
                } else {
                    pathCost = right + currentCost;
                }
            } else {
                if (right == -1) {
                    pathCost = left + currentCost;
                } else {
                    pathCost = Math.min(right, left) + currentCost;
                }
            }
        } else {
            if (left == -1) {
                if (right == -1) {
                    pathCost = up;
                } else {
                    pathCost = Math.min(up, right) + currentCost;
                }
            } else {
                if (right == -1) {
                    pathCost = Math.min(up, left) + currentCost;
                } else {
                    pathCost = Math.min(up, Math.min(right, left)) + currentCost;
                }
            }
        }

        traversed.delete(i, j);

        return pathCost;
    }


    public int down(int costArray[][], int m, int n, int i, int j) {
        if (traversed.listSearch(i, j)) {
            return -1;
        }
        if (i == m && j == n) {
            return costArray[i][j];
        }
        int pathCost;

        int currentCost = costArray[i][j];

        traversed.add(i, j);

        int down;
        int left;
        int right;

        if (i >= costArray.length - 1) {
            down = -1;
        } else {
            down = down(costArray, m, n, i + 1, j);
        }

        if (j <= 0) {
            left = -1;
        } else {
            left = left(costArray, m, n, i, j - 1);
        }

        if (j >= costArray[0].length - 1) {
            right = -1;
        } else {
            right = right(costArray, m, n, i, j + 1);
        }

        if (down == -1) {
            if (left == -1) {
                if (right == -1) {
                    pathCost = -1;
                } else {
                    pathCost = right + currentCost;
                }
            } else {
                if (right == -1) {
                    pathCost = left + currentCost;
                } else {
                    pathCost = Math.min(right, left) + currentCost;
                }
            }
        } else {
            if (left == -1) {
                if (right == -1) {
                    pathCost = down;
                } else {
                    pathCost = Math.min(down, right) + currentCost;
                }
            } else {
                if (right == -1) {
                    pathCost = Math.min(down, left) + currentCost;
                } else {
                    pathCost = Math.min(down, Math.min(right, left)) + currentCost;
                }
            }
        }

        traversed.delete(i, j);

        return pathCost;
    }

    public int left(int costArray[][], int m, int n, int i, int j) {
        if (traversed.listSearch(i, j)) {
            return -1;
        }
        if (i == m && j == n) {
            return costArray[i][j];
        }
        int pathCost;

        int currentCost = costArray[i][j];

        traversed.add(i, j);

        int up;
        int left;
        int down;

        if (i <= 0) {
            up = -1;
        } else {
            up = up(costArray, m, n, i - 1, j);
        }

        if (j <= 0) {
            left = -1;
        } else {
            left = left(costArray, m, n, i, j - 1);
        }

        if (i >= costArray.length - 1) {
            down = -1;
        } else {
            down = down(costArray, m, n, i + 1, j);
        }

        if (left == -1) {
            if (up == -1) {
                if (down == -1) {
                    pathCost = -1;
                } else {
                    pathCost = down + currentCost;
                }
            } else {
                if (down == -1) {
                    pathCost = up + currentCost;
                } else {
                    pathCost = Math.min(up, down) + currentCost;
                }
            }
        } else {
            if (left == -1) {
                if (down == -1) {
                    pathCost = left;
                } else {
                    pathCost = Math.min(left, down) + currentCost;
                }
            } else {
                if (down == -1) {
                    pathCost = Math.min(up, left) + currentCost;
                } else {
                    pathCost = Math.min(up, Math.min(down, left)) + currentCost;
                }
            }
        }

        traversed.delete(i, j);

        return pathCost;
    }


    public int right(int costArray[][], int m, int n, int i, int j) {
        if (traversed.listSearch(i, j)) {
            return -1;
        }
        if (i == m && j == n) {
            return costArray[i][j];
        }
        int pathCost;

        int currentCost = costArray[i][j];

        traversed.add(i, j);

        int down;
        int up;
        int right;

        if (i == costArray.length - 1) {
            down = -1;
        } else {
            down = down(costArray, m, n, i + 1, j);
        }

        if (i == 0) {
            up = -1;
        } else {
            up = up(costArray, m, n, i - 1, j);
        }

        if (j == costArray[0].length - 1) {
            right = -1;
        } else {
            right = right(costArray, m, n, i, j + 1);
        }

        if (right == -1) {
            if (up == -1) {
                if (down == -1) {
                    pathCost = -1;
                } else {
                    pathCost = down + currentCost;
                }
            } else {
                if (down == -1) {
                    pathCost = up + currentCost;
                } else {
                    pathCost = Math.min(down, up) + currentCost;
                }
            }
        } else {
            if (up == -1) {
                if (down == -1) {
                    pathCost = right;
                } else {
                    pathCost = Math.min(down, right) + currentCost;
                }
            } else {
                if (down == -1) {
                    pathCost = Math.min(right, up) + currentCost;
                } else {
                    pathCost = Math.min(down, Math.min(right, up)) + currentCost;
                }
            }
        }

        traversed.delete(i, j);

        return pathCost;
    }
}
