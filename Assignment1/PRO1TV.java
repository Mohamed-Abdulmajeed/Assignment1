
package pro1.tv;
class TV
{
public int channel;
public int volumeLevel;
public boolean on;
TV()
{}
public void turnOn ()
{
    on=true;
    System.out.println("This TV has been turned on");
}
public void turnOff ()
{
    on=false;
    System.out.println("This TV is not turned on");
}
public void setChannel (int newChannel)
{
if(newChannel<=120&&newChannel>=1)
   {
    channel=newChannel;
    System.out.println("The Channel = "+ channel);
   }
else
    System.out.println("This Channel cannot be added");
}
public void setVolume (int newVolume)
{
if(newVolume<=7&&newVolume>=1)
   {
       volumeLevel=newVolume;
    System.out.println("The Volume = "+volumeLevel);
   }
else
    System.out.println("This Volume cannot be added ");
}
public void ChannelUp()
{
if(channel<120)
   {
    channel++;
    System.out.println("Channel Number : "+ channel);
   }
else
    System.out.println(" This Channel is not working");
}
public void Volumeup()
{
if(volumeLevel<7)
   {
    volumeLevel++;
    System.out.println(" volumeLevel : "+ volumeLevel);
   }
}
public void ChannelDown()
{
if(channel>1)
   {
    channel--;
    System.out.println("Channel Number : "+ channel);
   }
else
    System.out.println(" This Channel is not working");
}
public void VolumeDown()
{
if(volumeLevel>1)
   {
    volumeLevel--;
    System.out.println(" volumeLevel : "+ volumeLevel);
   }
}
}
public class PRO1TV {

    
public static void main(String[] args) {
TV tv1=new TV();
        
        tv1.ChannelUp();
        tv1.ChannelDown();
        tv1.Volumeup();
        tv1.VolumeDown();
        tv1.turnOff();
        tv1.turnOn();
        tv1.setChannel(2);
        tv1.setChannel(10);       
        tv1.ChannelUp();
        tv1.ChannelUp();
        tv1.setVolume(5);
        tv1.setVolume(1);
        tv1.Volumeup();
        tv1.Volumeup();
        tv1.ChannelUp();
        tv1.ChannelDown();
        tv1.Volumeup();
        tv1.VolumeDown();
        tv1.turnOff();
        tv1.turnOn();
}
}
