
public interface InputConfig {

    static interface InputConfigVisitor<T>{
        public T visitFile(FileInputConfig fileInputConfig);
    }
    static <T> T visitInputConfig(InputConfig config, InputConfigVisitor<T> visitor){

        if(config instanceof FileInputConfig){
            return visitor.visitFile((FileInputConfig) config);

        }
        throw new RuntimeException("Unexpected config type: " + config.getClass());
    }

}
//done