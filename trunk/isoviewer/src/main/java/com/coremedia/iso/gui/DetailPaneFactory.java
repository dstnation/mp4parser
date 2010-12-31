/*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.iso.gui;

import com.coremedia.iso.boxes.AbstractBox;
import com.coremedia.iso.mdta.Sample;

import javax.swing.*;
import java.awt.*;

/**
 * Gets the correct detail pane for an object (Box or Sample by now).
 */
public class DetailPaneFactory {
    public JComponent createDetailPane(Object object) {
        if (object instanceof AbstractBox) {
            return new GenericBoxPane((AbstractBox) object);
        } else if (object instanceof Sample) {
            return new GenericSamplePane((Sample) object);
        }
        JPanel result = new JPanel();
        result.setLayout(new BorderLayout());
        return result;
    }
}
