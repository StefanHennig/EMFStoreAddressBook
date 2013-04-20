package console;

import org.eclipse.emf.emfstore.internal.client.model.Usersession;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreClientUtil;

public class EMFStoreClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Usersession session = EMFStoreClientUtil.createUsersession("super", "super", "192.168.207.40", 8080);

		System.out.println(session.getServerInfo());
	}

}
