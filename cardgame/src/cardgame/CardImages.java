package cardgame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CardImages {
	private static boolean ready = false;

	public static BufferedImage cardback;
	public static BufferedImage jocker;

	public static BufferedImage aceDiamond;
	public static BufferedImage aceHeart;
	public static BufferedImage aceSpade;
	public static BufferedImage aceTref;

	public static BufferedImage Kdiamond;
	public static BufferedImage Kheart;
	public static BufferedImage Kspade;
	public static BufferedImage Ktref;

	public static BufferedImage Qdiamond;
	public static BufferedImage Qheart;
	public static BufferedImage Qspade;
	public static BufferedImage Qtref;

	public static BufferedImage Jdiamond;
	public static BufferedImage Jheart;
	public static BufferedImage Jspade;
	public static BufferedImage Jtref;

	/**
	 * @return the ready
	 */
	public static boolean isReady() {
		return ready;
	}

	/**
	 * @param ready
	 *            the ready to set
	 */
	public static void setReady(boolean ready) {
		CardImages.ready = ready;
	}

	/**
	 * @return the cardback
	 */
	public static BufferedImage getCardback() {
		return cardback;
	}

	/**
	 * @param cardback
	 *            the cardback to set
	 */
	public static void setCardback(BufferedImage cardback) {
		CardImages.cardback = cardback;
	}

	/**
	 * @return the jocker
	 */
	public static BufferedImage getJocker() {
		return jocker;
	}

	/**
	 * @param jocker
	 *            the jocker to set
	 */
	public static void setJocker(BufferedImage jocker) {
		CardImages.jocker = jocker;
	}

	/**
	 * @return the aceDiamond
	 */
	public static BufferedImage getAceDiamond() {
		return aceDiamond;
	}

	/**
	 * @param aceDiamond
	 *            the aceDiamond to set
	 */
	public static void setAceDiamond(BufferedImage aceDiamond) {
		CardImages.aceDiamond = aceDiamond;
	}

	/**
	 * @return the aceHeart
	 */
	public static BufferedImage getAceHeart() {
		return aceHeart;
	}

	/**
	 * @param aceHeart
	 *            the aceHeart to set
	 */
	public static void setAceHeart(BufferedImage aceHeart) {
		CardImages.aceHeart = aceHeart;
	}

	/**
	 * @return the aceSpade
	 */
	public static BufferedImage getAceSpade() {
		return aceSpade;
	}

	/**
	 * @param aceSpade
	 *            the aceSpade to set
	 */
	public static void setAceSpade(BufferedImage aceSpade) {
		CardImages.aceSpade = aceSpade;
	}

	/**
	 * @return the aceTref
	 */
	public static BufferedImage getAceTref() {
		return aceTref;
	}

	/**
	 * @param aceTref
	 *            the aceTref to set
	 */
	public static void setAceTref(BufferedImage aceTref) {
		CardImages.aceTref = aceTref;
	}

	/**
	 * @return the kdiamond
	 */
	public static BufferedImage getKdiamond() {
		return Kdiamond;
	}

	/**
	 * @param kdiamond
	 *            the kdiamond to set
	 */
	public static void setKdiamond(BufferedImage kdiamond) {
		Kdiamond = kdiamond;
	}

	/**
	 * @return the kheart
	 */
	public static BufferedImage getKheart() {
		return Kheart;
	}

	/**
	 * @param kheart
	 *            the kheart to set
	 */
	public static void setKheart(BufferedImage kheart) {
		Kheart = kheart;
	}

	/**
	 * @return the kspade
	 */
	public static BufferedImage getKspade() {
		return Kspade;
	}

	/**
	 * @param kspade
	 *            the kspade to set
	 */
	public static void setKspade(BufferedImage kspade) {
		Kspade = kspade;
	}

	/**
	 * @return the ktref
	 */
	public static BufferedImage getKtref() {
		return Ktref;
	}

	/**
	 * @param ktref
	 *            the ktref to set
	 */
	public static void setKtref(BufferedImage ktref) {
		Ktref = ktref;
	}

	/**
	 * @return the qdiamond
	 */
	public static BufferedImage getQdiamond() {
		return Qdiamond;
	}

	/**
	 * @param qdiamond
	 *            the qdiamond to set
	 */
	public static void setQdiamond(BufferedImage qdiamond) {
		Qdiamond = qdiamond;
	}

	/**
	 * @return the qheart
	 */
	public static BufferedImage getQheart() {
		return Qheart;
	}

	/**
	 * @param qheart
	 *            the qheart to set
	 */
	public static void setQheart(BufferedImage qheart) {
		Qheart = qheart;
	}

	/**
	 * @return the qspade
	 */
	public static BufferedImage getQspade() {
		return Qspade;
	}

	/**
	 * @param qspade
	 *            the qspade to set
	 */
	public static void setQspade(BufferedImage qspade) {
		Qspade = qspade;
	}

	/**
	 * @return the qtref
	 */
	public static BufferedImage getQtref() {
		return Qtref;
	}

	/**
	 * @param qtref
	 *            the qtref to set
	 */
	public static void setQtref(BufferedImage qtref) {
		Qtref = qtref;
	}

	/**
	 * @return the jdiamond
	 */
	public static BufferedImage getJdiamond() {
		return Jdiamond;
	}

	/**
	 * @param jdiamond
	 *            the jdiamond to set
	 */
	public static void setJdiamond(BufferedImage jdiamond) {
		Jdiamond = jdiamond;
	}

	/**
	 * @return the jheart
	 */
	public static BufferedImage getJheart() {
		return Jheart;
	}

	/**
	 * @param jheart
	 *            the jheart to set
	 */
	public static void setJheart(BufferedImage jheart) {
		Jheart = jheart;
	}

	/**
	 * @return the jspade
	 */
	public static BufferedImage getJspade() {
		return Jspade;
	}

	/**
	 * @param jspade
	 *            the jspade to set
	 */
	public static void setJspade(BufferedImage jspade) {
		Jspade = jspade;
	}

	/**
	 * @return the jtref
	 */
	public static BufferedImage getJtref() {
		return Jtref;
	}

	/**
	 * @param jtref
	 *            the jtref to set
	 */
	public static void setJtref(BufferedImage jtref) {
		Jtref = jtref;
	}

	/**
	 * Reading card images from file
	 * 
	 * @throws IOException
	 */
	public static void BufferCardImages() throws IOException {
		cardback = ImageIO.read(new File("cards/cardback.jpg"));
		jocker = ImageIO.read(new File("cards/jocker1.jpg"));

		aceDiamond = ImageIO.read(new File("cards/aceDiamond.jpg"));
		aceHeart = ImageIO.read(new File("cards/aceHeart.jpg"));
		aceSpade = ImageIO.read(new File("cards/aceSpade.jpg"));
		aceTref = ImageIO.read(new File("cards/aceTref.jpg"));

		Kdiamond = ImageIO.read(new File("cards/Kdiamond.jpg"));
		Kheart = ImageIO.read(new File("cards/Kheart.jpg"));
		Kspade = ImageIO.read(new File("cards/Kspade.jpg"));
		Ktref = ImageIO.read(new File("cards/Ktref.jpg"));

		Qdiamond = ImageIO.read(new File("cards/Qdiamond.jpg"));
		Qheart = ImageIO.read(new File("cards/Qheart.jpg"));
		Qspade = ImageIO.read(new File("cards/Qspade.jpg"));
		Qtref = ImageIO.read(new File("cards/Qtref.jpg"));

		Jdiamond = ImageIO.read(new File("cards/Jdiamond.jpg"));
		Jheart = ImageIO.read(new File("cards/Jheart.jpg"));
		Jspade = ImageIO.read(new File("cards/Jspade.jpg"));
		Jtref = ImageIO.read(new File("cards/Jtref.jpg"));

		ready = true;
	}
	
}
