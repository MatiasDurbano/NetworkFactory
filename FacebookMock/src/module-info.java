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
	uses com.RedSocial.Network;
	provides com.RedSocial.Network with com.FacebookMock.FacebookRedImpl;
}