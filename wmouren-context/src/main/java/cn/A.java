package cn;

import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

public class A implements ImportAware {
    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        System.out.println(importMetadata.getClassName());
    }
}
