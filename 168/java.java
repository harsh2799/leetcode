class Java {
    public String convertToTitle(int columnNumber) {
        String op = "";
        while(columnNumber > 0) {
            op = (char)((int)'A' + (columnNumber - 1)%26) + op;
            columnNumber = (columnNumber - 1)/26;
        }
        
        return op;
    }
}