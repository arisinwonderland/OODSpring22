public class Main
{
    public static void main(String args[])
    {
        Main m = new Main();
        m.go();
    }
    
    public void go()
    {
        Customer c = new Customer("Tom", "Smith");
        Order o = new Order(c);
        o.addItem(new Item("Greeting Card", 1.50, 1));
        o.addItem(new Item("Baseball Glove", 54.00, 1));
        o.addItem(new Item("Notebook", 2.50, 3));
        
        System.out.println(o);
    }
}