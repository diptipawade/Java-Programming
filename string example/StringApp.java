

 class StringApp {
 public static void main(String args[]) {
  String s = " Java Developer's Guide "; 
  System.out.println(s);
  System.out.println(s.toUpperCase());
  System.out.println(s.toLowerCase());
  System.out.println("["+s+"]"); 
  s=s.trim();
  System.out.println("["+s+"]"); 
  s=s.replace('J','X');
  s=s.replace('D','Y');
  s=s.replace('G','Z');
  System.out.println(s);
  int i1 = s.indexOf('X');
  System.out.println(i1);
  int i2 = s.indexOf('Y');
  int i3 = s.indexOf('Z');
  char ch[] = s.toCharArray();
  ch[i1]='J';
  ch[i2]='D';
  ch[i3]='G';
  s = new String(ch);
  System.out.println(s);
 }
}

/*

 Java Developer's Guide
 JAVA DEVELOPER'S GUIDE
 java developer's guide
[ Java Developer's Guide ]
[Java Developer's Guide]
Xava Yeveloper's Zuide
Java Developer's Guide
*/