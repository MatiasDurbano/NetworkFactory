/**
 * 
 */
/**
 * @author Matias
 *
 */
module FacebookMock {
	exports com.FacebookMock;
	requires SocialNetworkInterface;
	uses com.Network.Network;
	provides com.Network.Network with com.FacebookMock.FacebookMockNetworkImpl;
}