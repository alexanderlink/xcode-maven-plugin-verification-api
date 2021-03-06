/*
 * #%L
 * xcode-maven-plugin
 * %%
 * Copyright (C) 2012 SAP AG
 * %%
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
 * #L%
 */
package com.sap.prd.mobile.ios.mios;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.maven.project.MavenProject;

public abstract class VerificationCheck
{
  private IXCodeContext context;
  private IEffectiveBuildSettings effectiveBuildSettings;
  private MavenProject mavenProject;
  protected static final Logger log = LogManager.getLogManager().getLogger("com.sap.prd.mobile.ios.mios");
  
  protected MavenProject getMavenProject()
  {
    return mavenProject;
  }

  void setMavenProject(MavenProject mavenProject)
  {
    this.mavenProject = mavenProject;
  }

  final void setXcodeContext(IXCodeContext context)
  {
    this.context = context;
  }

  protected IXCodeContext getXcodeContext()
  {
    return this.context;
  }
  
  final void setEffectiveBuildSettings(final IEffectiveBuildSettings effectiveBuildSettings) {
    this.effectiveBuildSettings = effectiveBuildSettings;
  }
  
  protected final IEffectiveBuildSettings getEffectiveBuildSettings() {
    return this.effectiveBuildSettings;
  }

  public abstract void check() throws VerificationException;
}
