package Solid;

class Usermanger
{
    void adduser()
    {
        System.out.println("user added");
    }
    void sendmail(String user)
    {
        System.out.println("Send email");
    }
}

//if logic of email has to change then we have modify the usermanger class that it fails single responsibilty principal
class addU
{
    void addUser()
    {
        System.out.println("Single respomnsiblity principal");
    }
}
class EmailSend
{
    void sendmail(String user)
    {
        System.out.println("email Send");
    }
}


public class singleRes {
    public static void main(String[] args) {
        Usermanger usermanger=new Usermanger();
        usermanger.sendmail("ram");
        EmailSend send=new EmailSend();
        send.sendmail("ram");

    }
}
