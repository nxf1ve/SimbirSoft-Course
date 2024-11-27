package lection_3;

interface ICargoHandler<T> {
    void loadCargo(T cargo);
    void unloadCargo();
}
