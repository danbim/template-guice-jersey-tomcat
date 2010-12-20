/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <daniel@bimschas.com> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Daniel Bimschas
 * ----------------------------------------------------------------------------
 */
package de.danbim.templateguicejerseytomcat;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TemplateMessage {

    public String param;

    public TemplateMessage() {
    }

    public TemplateMessage(String param) {
        this.param = param;
    }
}
