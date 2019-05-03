/*
 * Copyright (C) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.codegen;

import static java.lang.reflect.Modifier.FINAL;

import java.io.IOException;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

@SupportedAnnotationTypes("com.google.gson.codegen.GeneratedTypeAdapter")
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public final class GeneratedTypeAdapterProcessor extends AbstractProcessor {
  @Override public boolean process(Set<? extends TypeElement> types, RoundEnvironment env) {
    System.out.println("invoked GeneratedTypeAdapterProcessor");
    try {
      for (Element element : env.getElementsAnnotatedWith(GeneratedTypeAdapter.class)) {
        writeAdapter((TypeElement) element);
      }
    } catch (IOException e) {
      processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, e.getMessage());
    }
    return true;
    
  }

  private void writeAdapter(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
    writeAdapterff(type);
  }
   private void writeAdapterff(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdaptercv(type);
  }
   private void writeAdaptercv(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapterde(type);
  }
   private void writeAdapterde(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdaptere(type);
  }
   private void writeAdaptere(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapterf(type);
  }
   private void writeAdapterf(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdaptera(type);
  }
   private void writeAdaptera(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter129(type);
  }
   private void writeAdapter129(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter125(type);
  }
   private void writeAdapter125(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter119(type);
  }
   private void writeAdapter119(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter118(type);
  }
   private void writeAdapter118(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter117(type);
  }
   private void writeAdapter117(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter116(type);
  }
   private void writeAdapter116(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter115(type);
  }
   private void writeAdapter115(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter113(type);
  }
   private void writeAdapter113(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter112(type);
  }
   private void writeAdapter112(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter10(type);
  }
   private void writeAdapter10(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter9(type);
  }
   private void writeAdapter9(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter8(type);
  }
   private void writeAdapter8(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter7(type);
  }
   private void writeAdapter7(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter6(type);
  }
   private void writeAdapter6(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter5(type);
  }
   private void writeAdapter5(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter4(type);
  }
   private void writeAdapter4(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter3(type);
  }
   private void writeAdapter3(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter2(type);
  }
   private void writeAdapter2(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     writeAdapter11 (type);
  }
   private void writeAdapter11(TypeElement type) throws IOException {
    String typeAdapterName = CodeGen.adapterName(type, "$TypeAdapter");
    JavaFileObject sourceFile = processingEnv.getFiler()
        .createSourceFile(typeAdapterName, type);
    System.out.println("Generating type adapter: " + typeAdapterName + " in " + sourceFile.getName());

    JavaWriter writer = new JavaWriter(sourceFile.openWriter());
    writer.addPackage(CodeGen.getPackage(type).getQualifiedName().toString());
    writer.beginType(typeAdapterName, "class", FINAL, null);
    writer.endType();
    writer.close();
     
  }
  
}
