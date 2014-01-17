package Direction;

public interface InterfaceCursor 
{
	 /*
     * Retourne la position de l'objet.
     */
    public InterfacePoint getPosition();

    /*
     * Retourne la direction vers laquelle l'objet est tournÃ©.
     */
    public InterfacePoint getDirection();

    /*
     * Restaure la position Ã  0 et la direction Ã  (1, 0)
     */
    public void reset();

    /*
     * Fait avancer le mobile d'un pas dans la direction dans laquelle
     * il est tournÃ©.
     */
    public void stepStraigth();

    /*
     * Fait pivoter l'objet d'un quart de tour vers la gauche.
     */
    public void turnLeft();

    /*
     * Fait pivoter l'objet d'un quart de tour vers la droite.
     */
    public void turnRight();

}
