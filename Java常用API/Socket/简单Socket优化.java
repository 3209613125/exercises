class send{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        while (true){
            String str = scanner.nextLine();
            if (str.equals("quit")){
                break;
            }
            else{
                DatagramPacket packet = new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
                socket.send(packet);
            }
        }
        socket.close();
    }
}
class receive{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        while (true){
            socket.receive(packet);
            byte[] arr = packet.getData();
            int len = packet.getLength();
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("ip "+ip+":"+"port "+port+" "+new String(arr,0,len));
        }
    }
}
