package principal;

public enum Tipo {
    AGUA,
    FUEGO,
    PLANTA,
    BICHO,
    VOLADOR,
    ELECTRICO,
    TIERRA,
    DRAGON,
    VENENO,
    ROCA,
    PSQUICO,
    FANTASMA;   

    public double multiplicador(Tipo otro) {
        switch (this) {
            case AGUA:
                switch (otro) {
                    case FUEGO:
                    case TIERRA:
                    case ROCA:
                        return 2.0;
                    case AGUA:
                    case PLANTA:
                    case DRAGON:
                        return 0.5;
                    default:
                        return 1.0;
                }

            case FUEGO:
                switch (otro) {
                    case AGUA:
                    case TIERRA:
                    case ROCA:
                        return 0.5;
                    case PLANTA:
                    case BICHO:
                        return 2.0;
                    default:
                        return 1.0;
                }