/**
 * 
 */
/**
 * @author Matias
 *
 */
module TwitterMock {
	exports com.TwitterMock;
	requires SocialNetworkInterface;
	uses com.Network.Network;
	provides com.Network.Network with com.TwitterMock.TwitterMockNetworkImpl;
	
}