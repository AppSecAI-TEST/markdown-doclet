/*
 * Copyright 2013 Raffael Herzog
 *
 * This file is part of markdown-doclet.
 *
 * markdown-doclet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * markdown-doclet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with markdown-doclet.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.raffael.mddoclet.tags;

import com.sun.javadoc.Tag;

import ch.raffael.mddoclet.MarkdownDoclet;


/**
 * Renders a tag by processing the {@link com.sun.javadoc.Tag#text() text}.
 *
 * @author <a href="mailto:herzog@raffael.ch">Raffael Herzog</a>
 */
public class SimpleTagRenderer implements TagRenderer<Tag> {

    public static final SimpleTagRenderer INSTANCE = new SimpleTagRenderer();

    @Override
    public void render(Tag tag, StringBuilder target, MarkdownDoclet doclet) {
        target.append(tag.name()).append(" ").append(TagRendering.simplifySingleParagraph(doclet.toHtml(tag.text())));
    }

}
