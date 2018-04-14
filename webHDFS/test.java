import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://localhost:50070/webhdfs/v1/user/bijoyan/tutorial1.txt?user.name=bijoyan&op=OPEN");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setDoInput(true);
		InputStream in = con.getInputStream();
		int ch;
		while((ch=in.read())!=-1)
		{
			System.out.print((char)ch);
		}
	}

}