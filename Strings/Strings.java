class Strings{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = "James Gosling";
        String namex = "James Gosling";
    
        String founder = new String("James Gosling");
        String founderx = new String("James Gosling");

        System.out.println(founder.equals(founderx)); // true
        System.out.println(founder.equals(name));     // true
        System.out.println(name.equals(namex));       // true
        System.out.println(name.equals(founder));     // true
        System.out.println(name==namex);              // true

        System.out.println(founderx==founder);        // false

        String foundery = founder;

        System.out.println(foundery==founder);              // true
    }
}

/**
 *  All strings are objects of predefined class String
 *  
 *  ==          checks for references to string objects are equal or not
 *  equals()    checks if the contect of strings are equal or not
 */